-- liquibase formatted sql

-- changeset karavaev:create_notification_task

create TABLE notification_task
(
id SERIAL,
message TEXT NOT NULL,
chat_id BIGINT NOT NULL,
notification_date_time TIMESTAMP NOT NULL
);