create table if not exists pull_requests(
test_case_id Integer not null,
pr_commit1 varchar(255) null,
pr_commit_message1 varchar(255) null,
pr_commit2 varchar(255) null,
pr_commit_message2 varchar(255) null,
pr_commit3 varchar(255) null,
pr_commit_message3 varchar(255) null,
pull_request_system varchar(255) null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint pull_requests_pk primary key(test_case_id));
