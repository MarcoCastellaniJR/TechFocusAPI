CREATE TABLE `tech_focus`.`employee` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(155) ,
  `last_name` VARCHAR(155) ,
  `date_of_birth` DATE ,
  `cpf` VARCHAR(11) ,
  `rg` VARCHAR(9) ,
  `adress` VARCHAR(255),
  `salary` DOUBLE,
  `role` INT,
  `gender` VARCHAR(1),
  PRIMARY KEY (`id`));
