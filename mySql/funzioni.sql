drop procedure if exists tomorrow;

delimiter //
create procedure tomorrow()
begin
	select date_add(curdate(), interval 1 day) as 'current date';
end;
// delimiter ;

call tomorrow();


delimiter //

create procedure tomorrow( in p_name varchar (30)) 

begin
	select date_add(curdate(), interval 1 day) as 'current date', p_name;
end;

// delimiter ;

call tomorrow('Ciro');




drop procedure if exists get_coder;

delimiter //

create procedure get_coder(
	in p_coder_id integer,
    out p_first_name varchar (20), out p_last_name varchar (20))
    
 begin
	select coder_id, first_name, last_name
    into p_coder_id, p_first_name, p_last_name
    from coders
    where coder_id = p_coder_id;
    
end;

// delimiter ;

call get_coder (104, @first, @last);
select @first, @last; 














