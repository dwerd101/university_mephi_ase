create table actual_number
(
    actual_number_id              bigserial not null,
    contracting_dso_number        int8,
    date                          date,
    employee_number               int8,
    local_personal_number         int8,
    out_staffing_other_dso_number int8,
    employees_type_id             int8,
    indicator_id                  int8,
    project_dso_id                int8,
    primary key (actual_number_id)
);
create table dso
(
    dso_id   bigserial not null,
    dso_name varchar(15),
    primary key (dso_id)
);
create table employees_type
(
    employees_type_id  bigserial not null,
    employee_type_name varchar(40),
    primary key (employees_type_id)
);
create table indicator
(
    indicator_id   bigserial not null,
    indicator_name varchar(80),
    primary key (indicator_id)
);
create table ottb
(
    ot_tb_id          bigserial not null,
    customer_fixed    int8,
    customer_issued   int8,
    customer_revealed int8,
    date              date,
    dso_fixed         int8,
    dso_issued        int8,
    dso_revealed      int8,
    project_dso_id    int8,
    primary key (ot_tb_id)
);
create table project
(
    project_id   bigserial not null,
    project_name varchar(15),
    primary key (project_id)
);
create table project_dso
(
    project_dso_id bigserial not null,
    dso_id         int8,
    project_id     int8,
    primary key (project_dso_id)
);
create table turnout
(
    turnout_id     bigserial not null,
    date           date,
    turnout_number int8,
    project_dso_id int8,
    primary key (turnout_id)
);
create table vaccination
(
    vaccination_id     bigserial not null,
    average_number     int8,
    average_number_nrb int8,
    date               date,
    vaccinated         int8,
    project_dso_id     int8,
    primary key (vaccination_id)
);
alter table actual_number
    add constraint FKuchn2cu554drq6pd9bjqbq2v foreign key (employees_type_id) references employees_type;
alter table actual_number
    add constraint FKlyemec84f7010m5qtryax8a39 foreign key (indicator_id) references indicator;
alter table actual_number
    add constraint FK9krn5bgncobyhydqyp8bdl1px foreign key (project_dso_id) references project_dso;
alter table ottb
    add constraint FK4lklx199qlydgb65gj3otv2jm foreign key (project_dso_id) references project_dso;
alter table project_dso
    add constraint FKk69mripuwka9nt8d29k5jsx5h foreign key (dso_id) references dso;
alter table project_dso
    add constraint FKdix183laoi563ylr6nasesa68 foreign key (project_id) references project;
alter table turnout
    add constraint FKd3c1kock42sorbbkhht7ks7gp foreign key (project_dso_id) references project_dso;
alter table vaccination
    add constraint FK8jlc8o61npuusrwe2nf7nbrw foreign key (project_dso_id) references project_dso;