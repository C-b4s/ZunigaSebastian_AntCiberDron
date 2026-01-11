-- database: ..\Databases\ZSAnt.sqlite
-- © 2K26 ❱──👾──❰ c_bit


DROP TABLE IF EXISTS zsHormiga;
DROP TABLE IF EXISTS zsHormigaTipo;
DROP TABLE IF EXISTS zsSexo;
DROP TABLE IF EXISTS zsAlimentoTipo;
DROP TABLE IF EXISTS zsEstado;
DROP TABLE IF EXISTS zsCatalogo;

CREATE TABLE zsHormiga (
     zsIdHormiga      INTEGER PRIMARY KEY AUTOINCREMENT
    ,zsIdHormigaTipo  INTEGER NOT NULL REFERENCES zsHormigaTipo (zsIdHormigaTipo)
    ,zsIdSexo         INTEGER NOT NULL REFERENCES zsSexo        (zsIdSexo)
    ,zsIdEstado       INTEGER NOT NULL REFERENCES zsEstado      (zsIdEstado)
    ,zsNombre         VARCHAR(15) NOT NULL UNIQUE
    ,zsDescripcion    VARCHAR(100) NULL
    ,zsEstado         VARCHAR(1)  NOT NULL DEFAULT ('A')
    ,zsFechaCreacion  DATETIME NOT NULL  DEFAULT (datetime('now','localtime'))
    ,zsFechaModifica  DATETIME NOT NULL  DEFAULT (datetime('now','localtime'))
);

CREATE TABLE zsHormigaTipo (
     zsIdHormigaTipo  INTEGER PRIMARY KEY AUTOINCREMENT     
    ,zsNombre         VARCHAR(15) NOT NULL UNIQUE
    ,zsDescripcion    VARCHAR(100) NULL
    ,zsEstado         VARCHAR(1)  NOT NULL DEFAULT ('A')
    ,zsFechaCreacion  DATETIME NOT NULL  DEFAULT (datetime('now','localtime'))
    ,zsFechaModifica  DATETIME NOT NULL  DEFAULT (datetime('now','localtime'))
);

CREATE TABLE zsAlimentoTipo (
     zsIdAlimentoTipo INTEGER PRIMARY KEY AUTOINCREMENT     
    ,zsNombre         VARCHAR(15) NOT NULL UNIQUE
    ,zsDescripcion    VARCHAR(100) NULL
    ,zsEstado         VARCHAR(1)  NOT NULL DEFAULT ('A')
    ,zsFechaCreacion  DATETIME NOT NULL  DEFAULT (datetime('now','localtime'))
    ,zsFechaModifica  DATETIME NOT NULL  DEFAULT (datetime('now','localtime'))
);

CREATE TABLE zsEstado (
     zsIdEstado       INTEGER PRIMARY KEY AUTOINCREMENT     
    ,zsNombre         VARCHAR(15) NOT NULL UNIQUE
    ,zsDescripcion    VARCHAR(100) NULL
    ,zsEstado         VARCHAR(1)  NOT NULL DEFAULT ('A')
    ,zsFechaCreacion  DATETIME NOT NULL  DEFAULT (datetime('now','localtime'))
    ,zsFechaModifica  DATETIME NOT NULL  DEFAULT (datetime('now','localtime'))
);

CREATE TABLE zsSexo (
     zsIdSexo         INTEGER PRIMARY KEY AUTOINCREMENT
    ,zsNombre         VARCHAR(15) NOT NULL UNIQUE
    ,zsDescripcion    VARCHAR(100) NULL
    ,zsEstado         VARCHAR(1)  NOT NULL DEFAULT ('A')
    ,zsFechaCreacion  DATETIME NOT NULL  DEFAULT (datetime('now','localtime'))
    ,zsFechaModifica  DATETIME NOT NULL  DEFAULT (datetime('now','localtime'))
);



CREATE TABLE zsCatalogo (
     zsIdCatalogo         INTEGER PRIMARY KEY AUTOINCREMENT
    ,zsIdCatalogoPadre    INTEGER 
    ,zsNombre             VARCHAR(20) NOT NULL  UNIQUE
    ,zsDetalle            VARCHAR(20)  NULL
    ,zsEstado             VARCHAR(1) NOT NULL DEFAULT ('A')
    ,zsFechaCreacion      DATETIME NOT NULL  DEFAULT (datetime('now','localtime'))
    ,zsFechaModifica      DATETIME  DEFAULT (datetime('now','localtime'))
);