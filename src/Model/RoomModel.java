/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

public class RoomModel{
	public String building;
	public String roomNo;
	public String rooomType;
	public String noOfBed;
	public String price;
	public String status;
	public RoomModel(){
		
		this.building="";
		this.roomNo="";
		this.rooomType="";
		this.noOfBed="";
		this.price="";
		this.status="";
	}
		
		public RoomModel(String building,String roomNo,String rooomType,String noOfBed,String price ,String status){
		this.building=building;
		this.roomNo=roomNo;
		this.rooomType=rooomType;
		this.noOfBed=noOfBed;
		this.price=price;
		this.status=status;
		}
			//setters
			public void setBuilding(String building){
				this.building=building;
			}
			public void setRoomNo(String roomNo){
					this.roomNo=roomNo;
			}
			public void setRoomType(String rooomType){
				this.rooomType=rooomType;
			}
			public void setNoOfBed(String noOfBed){
				this.noOfBed=noOfBed;
			}
			public void setPrice(String price){
				this.price=price;
			}
			public void setStatus(String status){
				this.status=status;
			}
			//getters
			public String getBuilding(){
				return this.building;
			}
			public String getRoomNo(){
				return this.roomNo;
			}
			public String getRoomType(){
				return this.rooomType;
	        }
			public String getNoOfBed(){
				return this.noOfBed;
			}
			public String getPrice(){
				return this.price;
			}
			public String getStatus(){
				return this.status;
			}
	
	}