package com.leyou.seckill.service;

import com.leyou.seckill.vo.SeckillGoods;
import com.leyou.seckill.vo.SeckillParameter;

import java.util.List;

/**
 * @Author: 98050
 * @Time: 2018-11-10 16:56
 * @Feature:
 */
public interface SeckillService {
    /**
     * 添加秒杀商品
     * @param seckillParameter
     */
    void addSeckillGoods(SeckillParameter seckillParameter);

    /**
     * 查询秒杀商品
     * @return
     */
    List<SeckillGoods> querySeckillGoods();

    /**
     * 创建订单
     * @param seckillGoods
     * @return
     */
    Long createOrder(SeckillGoods seckillGoods);
}
