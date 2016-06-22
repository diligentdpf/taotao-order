package diao.taotao.order.service;

import java.util.List;

import diao.taotao.common.util.TaotaoResult;
import diao.taotao.pojo.TbOrder;
import diao.taotao.pojo.TbOrderItem;
import diao.taotao.pojo.TbOrderShipping;

public interface OrderService {
    /** 创建订单 */
    public TaotaoResult createOrder(TbOrder order, List<TbOrderItem> itemList,
            TbOrderShipping orderShipping);
}
