package com.hurb.service.impl.center;

import com.github.pagehelper.PageHelper;
import com.hurb.enums.YesOrNo;
import com.hurb.mapper.*;
import com.hurb.pojo.OrderItems;
import com.hurb.pojo.OrderStatus;
import com.hurb.pojo.Orders;
import com.hurb.pojo.Users;
import com.hurb.pojo.bo.center.CenterUserBO;
import com.hurb.pojo.bo.center.OrderItemsCommentBO;
import com.hurb.pojo.vo.MyCommentVO;
import com.hurb.service.center.CenterUserService;
import com.hurb.service.center.MyCommentsService;
import com.hurb.utils.PagedGridResult;
import org.n3r.idworker.Sid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class MyCommentsServiceImpl extends BaseService implements MyCommentsService {

    @Autowired
    public OrderItemsMapper orderItemsMapper;

    @Autowired
    public OrdersMapper ordersMapper;

    @Autowired
    public OrderStatusMapper orderStatusMapper;

    @Autowired
    public ItemsCommentsMapperCustom itemsCommentsMapperCustom;

    @Autowired
    private Sid sid;

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public List<OrderItems> queryPendingComment(String orderId) {
        OrderItems query = new OrderItems();
        query.setOrderId(orderId);
        return orderItemsMapper.select(query);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public void saveComments(String orderId, String userId,
                             List<OrderItemsCommentBO> commentList) {

        // 1. 保存评价 items_comments
        for (OrderItemsCommentBO oic : commentList) {
            oic.setCommentId(sid.nextShort());
        }
        Map<String, Object> map = new HashMap<>();
        map.put("userId", userId);
        map.put("commentList", commentList);
        itemsCommentsMapperCustom.saveComments(map);

        // 2. 修改订单表改已评价 orders
        Orders order = new Orders();
        order.setId(orderId);
        order.setIsComment(YesOrNo.YES.type);
        ordersMapper.updateByPrimaryKeySelective(order);

        // 3. 修改订单状态表的留言时间 order_status
        OrderStatus orderStatus = new OrderStatus();
        orderStatus.setOrderId(orderId);
        orderStatus.setCommentTime(new Date());
        orderStatusMapper.updateByPrimaryKeySelective(orderStatus);
    }

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public PagedGridResult queryMyComments(String userId,
                                           Integer page,
                                           Integer pageSize) {

        Map<String, Object> map = new HashMap<>();
        map.put("userId", userId);

        PageHelper.startPage(page, pageSize);
        List<MyCommentVO> list = itemsCommentsMapperCustom.queryMyComments(map);

        return setterPagedGrid(list, page);
    }
}
