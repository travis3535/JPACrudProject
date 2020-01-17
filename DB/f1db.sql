-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema formula_one
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `formula_one` ;

-- -----------------------------------------------------
-- Schema formula_one
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `formula_one` DEFAULT CHARACTER SET utf8 ;
USE `formula_one` ;

-- -----------------------------------------------------
-- Table `team`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `team` ;

CREATE TABLE IF NOT EXISTS `team` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NULL,
  `driver` VARCHAR(45) NULL,
  `team_principle` VARCHAR(45) NULL,
  `est_year` VARCHAR(4) NULL,
  `description` VARCHAR(45) NULL,
  `factory_location` VARCHAR(45) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;

SET SQL_MODE = '';
DROP USER IF EXISTS f1user@localhost;
SET SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';
CREATE USER 'f1user'@'localhost' IDENTIFIED BY 'f1user';

GRANT SELECT, INSERT, TRIGGER, UPDATE, DELETE ON TABLE * TO 'f1user'@'localhost';

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

-- -----------------------------------------------------
-- Data for table `team`
-- -----------------------------------------------------
START TRANSACTION;
USE `formula_one`;
INSERT INTO `team` (`id`, `name`, `driver`, `team_principle`, `est_year`, `description`, `factory_location`) VALUES (1, 'Mclaren', 'Lando Norris', 'Andreas Seidl', '1966', '8 World Championships', 'United Kingdom');
INSERT INTO `team` (`id`, `name`, `driver`, `team_principle`, `est_year`, `description`, `factory_location`) VALUES (2, 'Mercedes AMG', 'Lewis Hamilton', 'Toto Wolff', '1970', '6 World Championships', 'United Kingdom');
INSERT INTO `team` (`id`, `name`, `driver`, `team_principle`, `est_year`, `description`, `factory_location`) VALUES (3, 'Ferrari', 'Sebastian Vettel', 'Mattia Binotto', '1950', '16 World Championships', 'Italy');
INSERT INTO `team` (`id`, `name`, `driver`, `team_principle`, `est_year`, `description`, `factory_location`) VALUES (4, 'Redbull', 'Max Verstappen', 'Christian Horner', '1997', '4 World Championships', 'United Kingdom');
INSERT INTO `team` (`id`, `name`, `driver`, `team_principle`, `est_year`, `description`, `factory_location`) VALUES (5, 'Alpha Tauri', 'Daniil Kvyat', 'Franz Tost', '1985', '0 World Championships', 'Italy');
INSERT INTO `team` (`id`, `name`, `driver`, `team_principle`, `est_year`, `description`, `factory_location`) VALUES (6, 'Haas', 'Romain Grosjean', 'Guenther Steiner', '2016', '0 World Championships', 'United States');
INSERT INTO `team` (`id`, `name`, `driver`, `team_principle`, `est_year`, `description`, `factory_location`) VALUES (7, 'Renault', 'Daniel Ricciardo', 'Cyril Abiteboul', '1986', '2 World Championships', 'United Kingdom');
INSERT INTO `team` (`id`, `name`, `driver`, `team_principle`, `est_year`, `description`, `factory_location`) VALUES (8, 'Williams', 'George Russell', 'Frank Williams', '1978', '9 World Championships', 'United Kingdom');
INSERT INTO `team` (`id`, `name`, `driver`, `team_principle`, `est_year`, `description`, `factory_location`) VALUES (9, 'Racing Point', 'Sergio Perez', 'Otmar Szafnauer', '1970', '0 World Championships', 'United Kingdom');
INSERT INTO `team` (`id`, `name`, `driver`, `team_principle`, `est_year`, `description`, `factory_location`) VALUES (10, 'Alfa Romeo', 'Kimi Raikkonen', 'Frederic Vasseur', '1993', '0 World Championships', 'Switzerland');

COMMIT;

