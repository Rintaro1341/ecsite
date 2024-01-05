package jp.co.internous.ecsite.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import jp.co.internous.ecsite.model.domain.MstGoods;

@Mapper
public interface MstGoodsMapper {
	
//	全ての商品情報を取得するメソッド
//	取得したデータはMstGoodsオブジェクトに変換されリストに格納し戻り値として返す
	@Select(value="SELECT * FROM mst_goods")
	List<MstGoods> findAll();
	
//	商品情報を挿入(テーブルに新しくレコードを追加)するためのメソッド
	@Insert("INSERT INTO mst_goods (goods_name, price) VALUES (#{goodsName}, #{price})")
	@Options(useGeneratedKeys=true, keyProperty="id")
	int insert(MstGoods goods);
	
	@Update("DELETE FROM mst_goods WHERE id = #{id}")
	int deleteById(int id);
}
