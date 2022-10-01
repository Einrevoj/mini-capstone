DROP SCHEMA IF EXISTS capstone cascade;
CREATE SCHEMA capstone;

CREATE TABLE capstone.users (
                             user_id uuid,
                             first_name varchar(150),
                             last_name varchar(150),
                             password varchar(150),
                             email varchar(150),
                             mobile_number bigserial,
                             created_date TIMESTAMP WITH TIME ZONE,
                             modified_date TIMESTAMP WITH TIME ZONE,
                             PRIMARY KEY (user_id)
)