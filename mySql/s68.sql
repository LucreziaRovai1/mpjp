-- cursor

use me;

drop procedure if exists email_coders;

delimiter //

create procedure email_coders()
begin
	declare v_done boolean default false;
	declare v_first_name varchar(20);
	declare v_last_name varchar(25);
	declare v_mailing_list varchar(1000) default ''; -- metto un default perché nel mio loop devo iniziare da qualcosa

	declare cur_coders cursor for
		select first_name, last_name from coders;
	declare continue handler for not found
		set v_done = true; -- quando il cursore avrà scandito tutte le righe setterò v_done a true invece che false

	open cur_coders; -- carica i dati nel cur_coders
	while not v_done do
		fetch cur_coders into v_first_name, v_last_name;
		set v_mailing_list = concat(v_mailing_list,
			lower(v_first_name), "." , lower(v_last_name), "@x.dd;");
	end while;

	select v_mailing_list as "mailing list";

    close cur_coders;
end;

// delimiter ;

call email_coders();
