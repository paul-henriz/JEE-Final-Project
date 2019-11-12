SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `jeeprj`
--

-- --------------------------------------------------------

--
-- Structure de la table `credentials`
--

DROP TABLE IF EXISTS `credentials`;
CREATE TABLE IF NOT EXISTS `credentials` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Login` varchar(32) NOT NULL,
  `Password` varchar(40) NOT NULL,
  `IsAdmin` tinyint(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `credentials`
--

INSERT INTO `credentials` (`ID`, `Login`, `Password`, `IsAdmin`) VALUES
(1, 'admin', 'd033e22ae348aeb5660fc2140aec35850c4da997', 1),
(2, 'empl', 'ecab8a146c22e7f8ceb3ee79b3aac9fb8f553f53', 0);

-- --------------------------------------------------------

--
-- Structure de la table `employees`
--

DROP TABLE IF EXISTS `employees`;
CREATE TABLE IF NOT EXISTS `employees` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Name` varchar(25) NOT NULL,
  `FirstName` varchar(25) NOT NULL,
  `TelHome` varchar(10) NOT NULL,
  `TelMob` varchar(10) NOT NULL,
  `TelPro` varchar(10) NOT NULL,
  `Adress` varchar(150) NOT NULL,
  `PostalCode` varchar(5) NOT NULL,
  `City` varchar(25) NOT NULL,
  `Email` varchar(40) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `employees`
--

INSERT INTO `employees` (`ID`, `Name`, `FirstName`, `TelHome`, `TelMob`, `TelPro`, `Adress`, `PostalCode`, `City`, `Email`) VALUES
(1, 'Simpson', 'Homer', '0123456789', '0612345678', '0698765432', '2 avenue Duff', '92700', 'Colombes', 'hsimpson@gmail.com'),
(2, 'Simpson', 'Bart', '0145362787', '0645362718', '0611563477', '10 rue des Rebelles', '92270', 'Bois-colombes', 'bsimpson@gmail.com'),
(3, 'Lagaffe', 'Gaston', '0187665987', '0623334256', '0654778654', '65 rue de la Paresse', '92700', 'Colombes', 'glagaffe@yahoo.fr'),
(4, 'Mafalda', 'Querida', '0187611987', '0783334256', '0658878654', '6 rue de Buenos Aires', '75016', 'Paris', 'qmafalda@hotmail.ar'),
(5, 'Woodpecker', 'Woody', '0187384987', '0622494256', '0674178654', '5 bvd des Picoreurs', '21000', 'Dijon', 'woody@mail.co.uk'),
(6, 'Brow', 'Charlie', '0122456678', '0699854673', '0623445166', '140 avenue Foche', '90000', 'Nanterre', 'cbrown@live.com');

-- --------------------------------------------------------

--
-- Structure de la table `history`
--

DROP TABLE IF EXISTS `history`;
CREATE TABLE IF NOT EXISTS `history` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `user` int(11) NOT NULL,
  `action` varchar(6) NOT NULL,
  `ip` varchar(15) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_user` (`user`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `history`
--

INSERT INTO `history` (`id`, `date`, `user`, `action`, `ip`) VALUES
(1, '2019-11-10 18:50:46', 1, 'login', '185.228.231.253'),
(2, '2019-11-10 18:51:38', 1, 'delete', '185.228.231.253'),
(3, '2019-11-10 18:55:48', 1, 'create', '185.228.231.253'),
(4, '2019-11-10 18:57:12', 1, 'save', '185.228.231.253'),
(5, '2019-11-10 18:57:26', 2, 'login', '185.228.231.253');

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `history`
--
ALTER TABLE `history`
  ADD CONSTRAINT `fk_user` FOREIGN KEY (`user`) REFERENCES `credentials` (`ID`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
