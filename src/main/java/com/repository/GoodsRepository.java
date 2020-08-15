package com.repository;

import com.entity.Goods;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @ClassName GoodsRepository
 * @Description: TODO
 * @Author lxc
 * @Date 2020/8/15 21:55
 * @Version V1.0
 **/
public interface GoodsRepository extends JpaRepository<Goods,Long> {
    List<Goods> findAllByGoodsIdBetween(Long goodsId1, Long goodsId2);

    List<Goods> findAllByGoodsIdIn(List<Long> goodsIds);
}
