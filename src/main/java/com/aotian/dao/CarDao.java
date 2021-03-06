package com.aotian.dao;

import java.util.List;

import com.aotian.domain.Car;

public interface CarDao {
	// 保存车辆信息
	public void addCar(Car car);
	// 删除车辆信息
	public void deleteCar(Car car);
	// 修改车辆信息
	public void updateCar(Car car);
	// 查询车辆信息
	public Car selectCar(Integer carId);
	// 获取分页车辆信息
	public List<Car> getCar(int pageNow,int pageSize);
	// 获取所有车辆总数
	public int countCar();
	// 模糊查询
	public List<Car> queryCar(String keyword,String field);
	
	// 查询产品信息
	public Car selectCar_byNo(String carNo);
}
