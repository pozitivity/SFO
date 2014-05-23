CREATE DATABASE sfo;
USE sfo;
CREATE TABLE IF NOT EXISTS type_user(
	type_user_id serial,
	type_user varchar(50) NOT NULL,
	PRIMARY KEY(type_user_id)
) DEFAULT CHARSET=utf8; 
CREATE TABLE IF NOT EXISTS city(
	city_id serial,
	city_name varchar(50) NOT NULL,
	PRIMARY KEY(city_id)
) DEFAULT CHARSET=utf8;
CREATE TABLE IF NOT EXISTS photo(
	photo_id serial,
	photo mediumblob,
	photo_name varchar(100) NOT NULL,
	PRIMARY KEY(photo_id)
) DEFAULT CHARSET=utf8;
CREATE TABLE IF NOT EXISTS info(
	info_id serial,
	info text,
	PRIMARY KEY(info_id)
) DEFAULT CHARSET=utf8;
CREATE TABLE IF NOT EXISTS logo(
	logo_id serial,
	logo mediumblob,
	logo_name varchar(100) NOT NULL,
	PRIMARY KEY(logo_id)
) DEFAULT CHARSET=utf8;
CREATE TABLE IF NOT EXISTS rubric(
	rubric_id serial,
	name varchar(100) NOT NULL,
	main_rubric_id bigint unsigned,
	PRIMARY KEY(rubric_id)
) DEFAULT CHARSET=utf8;
CREATE TABLE IF NOT EXISTS user(
	user_id serial,
	login varchar(50) NOT NULL,
	password varchar(50) NOT NULL,
	blocked boolean DEFAULT TRUE,
	city_id bigint unsigned NOT NULL,
	type_user_id bigint unsigned NOT NULL,
	PRIMARY KEY(user_id),
	UNIQUE KEY(login)
) DEFAULT CHARSET=utf8;
CREATE TABLE IF NOT EXISTS organization(
	organization_id serial,
	rubric_id bigint unsigned NOT NULL,
	address varchar(100) NOT NULL,
	info_id bigint unsigned,
	logo_id bigint unsigned,
	user_id bigint unsigned NOT NULL,
	city_id bigint unsigned NOT NULL,
	website varchar(100) NOT NULL,
	postcode varchar(100) NOT NULL,
	name varchar(100) NOT NULL,
	phone varchar(100) NOT NULL,
	published boolean DEFAULT FALSE,
	PRIMARY KEY(organization_id)
) DEFAULT CHARSET=utf8;
CREATE TABLE IF NOT EXISTS comment(
	comment_id serial,
	comment text NOT NULL,
	organization_id bigint unsigned NOT NULL,
	PRIMARY KEY(comment_id)
) DEFAULT CHARSET=utf8;
CREATE TABLE IF NOT EXISTS logevents(
	id serial,
	category VARCHAR(64) NOT NULL,
	action_name VARCHAR(256),
	severity VARCHAR(16) NOT NULL,
	when_date DATETIME NOT NULL,
	message VARCHAR(1024),
	extra MEDIUMTEXT,
	PRIMARY KEY (id)
) DEFAULT CHARSET=utf8;
ALTER TABLE organization ADD FOREIGN KEY(rubric_id) REFERENCES rubric(rubric_id) ON DELETE CASCADE ON UPDATE CASCADE;
ALTER TABLE organization ADD FOREIGN KEY(info_id) REFERENCES info(info_id) ON DELETE CASCADE ON UPDATE CASCADE;
ALTER TABLE organization ADD FOREIGN KEY(logo_id) REFERENCES logo(logo_id) ON DELETE CASCADE ON UPDATE CASCADE;
ALTER TABLE organization ADD FOREIGN KEY(user_id) REFERENCES user(user_id) ON DELETE CASCADE ON UPDATE CASCADE;
ALTER TABLE organization ADD FOREIGN KEY(city_id) REFERENCES city(city_id) ON DELETE CASCADE ON UPDATE CASCADE;

ALTER TABLE user ADD FOREIGN KEY(city_id) REFERENCES city(city_id) ON DELETE CASCADE ON UPDATE CASCADE;
ALTER TABLE user ADD FOREIGN KEY(type_user_id) REFERENCES type_user(type_user_id) ON DELETE CASCADE ON UPDATE CASCADE;

ALTER TABLE comment ADD FOREIGN KEY(organization_id) REFERENCES organization(organization_id) ON DELETE CASCADE ON UPDATE CASCADE;