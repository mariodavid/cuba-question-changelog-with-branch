update CQCWB_CUSTOMER set NAME = 'Mr Miyagi' where NAME is null ;
alter table CQCWB_CUSTOMER alter column NAME set not null ;
