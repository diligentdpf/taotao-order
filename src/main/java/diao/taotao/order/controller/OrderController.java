package diao.taotao.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import diao.taotao.common.util.ExceptionUtil;
import diao.taotao.common.util.TaotaoResult;
import diao.taotao.order.pojo.Order;
import diao.taotao.order.service.OrderService;

@Controller
public class OrderController {
    @Autowired
    private OrderService orderService;

    @RequestMapping(value="/create",method=RequestMethod.POST)
    @ResponseBody
    public TaotaoResult createOrder(@RequestBody Order order) {
        try {
            TaotaoResult result = orderService.createOrder(order, order.getOrderItems(),
                    order.getOrderShipping());
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            return TaotaoResult.build(500, ExceptionUtil.getStackTrace(e));
        }
    }
}
