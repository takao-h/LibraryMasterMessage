CREATE TABLE User (
  id bigint(20) NOT NULL AUTO_INCREMENT,
  name varchar(255) NOT NULL,
  email varchar(255) NOT NULL,
  twitter_accesstoken varchar(255),
  facebook_accesstoken varchar(255),
  password varchar(255) NOT NULL,
  PRIMARY KEY (id)
);

# --- !Downs

DROP TABLE User;