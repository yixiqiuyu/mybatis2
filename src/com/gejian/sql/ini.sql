select * from t_user;
drop table t_user;
create table t_user(
	id int primary key not null,
	name varchar2(20),
	password varchar2(20)
);
insert into t_user(id,name,password) values(1,'gejian','123');
commit;