package org.sourabh.spring;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements InitializingBean, DisposableBean{
	
	
	
	
	
	//Method 1
//	private String type;
//	private int height;
//	
//	
//	
//	
//	public Triangle(String type){
//		this.type = type;
//		
//	}
//	
//	public Triangle(int height){
//		this.height = height;
//		
//	}
//	
//	public Triangle(String type, int height){
//		this.type = type;
//		this.height = height;
//	}
//	
//	
//	public String getType() {
//		return type;
//	}
//	
//	public int getHeight(){
//		return height;
//	}


//	public void setType(String type) {
//		this.type = type;
//	}


//	public void draw(){
//		System.out.println(getType() + " Triangle Drawn of height " + getHeight());
//	}
	
	//Method 2
	
	
	
		private Point pointA;
		private Point pointB;
		private Point pointC;
	
		private ApplicationContext context = null;

		public Point getPointA() {
			return pointA;
		}




		public void setPointA(Point pointA) {
			this.pointA = pointA;
		}




		public Point getPointB() {
			return pointB;
		}




		public void setPointB(Point pointB) {
			this.pointB = pointB;
		}




		public Point getPointC() {
			return pointC;
		}




		public void setPointC(Point pointC) {
			this.pointC = pointC;
		}



		public void draw(){
			// code goes here
				try{
					System.out.println("Point A = "+ getPointA().getX() + ", " + getPointA().getY());
					System.out.println("Point B = "+getPointB().getX() + ", " + getPointB().getY());
					System.out.println("Point C = "+getPointC().getX() + ", " + getPointC().getY());
				}catch(Exception e){
					System.out.println("Warning.. "+ e);
				}

		}




//		@Override
//		public void setApplicationContext(ApplicationContext arg0) throws BeansException {
//			// TODO Auto-generated method stub
//			
//			this.context = context;
//			
//		}
//
//
//
//
//		@Override
//		public void setBeanName(String beanNAme) {
//			// TODO Auto-generated method stub
//			System.out.println("bean name is "+ beanNAme);
//			
//		}
		
		public void afterPropertiesSet() throws Exception{
			System.out.println("INitializing bean init method");
		}




		@Override
		public void destroy() throws Exception {
			// TODO Auto-generated method stub
			System.out.println("Bean destroyed");
			
		}
		
		public void myInit(){
			System.out.println("Init called");
		}
		public void cleanup(){
			System.out.println("cleanedup");
		}
	

}
