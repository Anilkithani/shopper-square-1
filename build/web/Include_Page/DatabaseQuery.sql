/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  hp
 * Created: 24-Nov-2016
 */

create table E_product(P_id varchar2(55),P_name varchar2(55),P_category varchar2(55),P_description varchar2(55),P_price varchar2(55),P_quantity varchar2(55));

insert into E_product(P_id,P_name,P_category,P_description,P_price,P_quantity)values("e1","Samsung","Electronics","This is best mobile in Samsung",12000.0,"1");


insert into E_product values('e3','HP laptop','Electronics','This is best laptop in HP series','30000','1');
select * from E_product;

insert into E_product values('e4','MAC Book','Electronics','This is a Mac from Apple','65000','1');

create table Cart_Item(Item_Id varchar2(55),User_Id varchar2(55),Price varchar(55),Quantity varchar2(55),P_id varchar2(55));

create table Cart(Cart_Id varchar2(55)primary key,Quantity varchar2(55)not null,Total_Price varchar2(55));

create table Register(Name varchar2(55),Contact varchar2(55),Address varchar2(55),Password varchar2 (55));

alter table cart_item add  cart_id Varchar2(55)constraint fk_cartitem_cart REFERENCES CART(cart_id);



create table fw_product(P_id varchar2(55),P_name varchar2(55),P_category varchar2(55),P_description varchar2(55),P_price varchar2(55),P_quantity varchar2(55));
insert into fw_product values('fw1','Formal Shoes','Footwear','This is leather shoe','1700','1');
insert into fw_product values('fw3','Formal Shoes','Footwear','This is leather shoe','1500','1');
insert into fw_product values('fw5','Sandals','Footwear','This is sandals for men','1300','1');
insert into fw_product values('fw6','Child Shoes','Footwear','This is child shoe','1100','1');



create table Cart_item(P_id varchar2(55),P_name varchar2(55),P_price varchar2(55),P_quantity varchar2(55));

create table hf_product(p_id varchar2(11),p_name varchar2(55),p_category varchar2(55),p_description varchar2(111), p_price varchar2(55),p_quantity varchar2(55));
insert into hf_product values('f1','couch','Furniture','This is best in furniture','15700',1);
insert into hf_product values('f2','Bad','Furniture','This is best Single bad in furniture','27700','1');
insert into hf_product values('f3','showcase','Furniture','This is best showcase in furniture','22700','1');
insert into hf_product values('f6','Full Home Furniture','Furniture','This is Home decorators','110700','1');


create table c_product(p_id varchar2(11),p_name varchar2(55),p_category varchar2(55),p_description varchar2(111), p_price varchar2(55),p_quantity varchar2(55));
insert into c_product values('c1','Shirt','Clothing','This is blue shirt','1700',1);
insert into c_product values('c2','T-Shirt','Clothing','This is white T-shirt','1700',1);
insert into c_product values('c3','T-Shirt','Clothing','This is best T-shirt','1500',1);


delete from hf_product where p_id='f5'
