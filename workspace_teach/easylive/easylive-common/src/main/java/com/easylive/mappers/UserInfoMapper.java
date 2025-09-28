package com.easylive.mappers;

import org.apache.ibatis.annotations.Param;

/**
 * 用户信息 数据库操作接口
 */
public interface UserInfoMapper<T,P> extends BaseMapper<T,P> {

	/**
	 * 根据UseId更新
	 */
	 Integer updateByUseId(@Param("bean") T t,@Param("useId") String useId);


	/**
	 * 根据UseId删除
	 */
	 Integer deleteByUseId(@Param("useId") String useId);


	/**
	 * 根据UseId获取对象
	 */
	 T selectByUseId(@Param("useId") String useId);


	/**
	 * 根据Email更新
	 */
	 Integer updateByEmail(@Param("bean") T t,@Param("email") String email);


	/**
	 * 根据Email删除
	 */
	 Integer deleteByEmail(@Param("email") String email);


	/**
	 * 根据Email获取对象
	 */
	 T selectByEmail(@Param("email") String email);


	/**
	 * 根据NickName更新
	 */
	 Integer updateByNickName(@Param("bean") T t,@Param("nickName") String nickName);


	/**
	 * 根据NickName删除
	 */
	 Integer deleteByNickName(@Param("nickName") String nickName);


	/**
	 * 根据NickName获取对象
	 */
	 T selectByNickName(@Param("nickName") String nickName);


}
