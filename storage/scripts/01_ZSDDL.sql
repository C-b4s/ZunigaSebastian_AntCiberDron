-- © 2K26 ❱──👾──❰ c_bit? code is life : life is code

DROP TABLE IF EXISTS Hormiga;
DROP TABLE IF EXISTS HormigaTipo;
DROP TABLE IF EXISTS Sexo;

CREATE TABLE zsHormiga (
     zsIdHormiga      INTEGER PRIMARY KEY AUTOINCREMENT
    ,zsIdHormigaTipo  INTEGER NOT NULL REFERENCES zsHormigaTipo (zsIdHormigaTipo)
    ,zsIdSexo         INTEGER NOT NULL REFERENCES zsSexo        (zsIdSexo)
    ,zsNombre         VARCHAR(15) NOT NULL UNIQUE
    ,zsDescripcion    VARCHAR(100) NULL
    ,zsEstado         VARCHAR(1)  NOT NULL DEFAULT 'A'
    ,zsFechaCreacion  DATETIME NOT NULL  DEFAULT (datetime('now','localtime'))
    ,zsFechaModifica  DATETIME NOT NULL  DEFAULT (datetime('now','localtime'))
);

CREATE TABLE zsHormigaTipo (
     zsIdHormigaTipo  INTEGER PRIMARY KEY AUTOINCREMENT     
    ,zsNombre         VARCHAR(15) NOT NULL UNIQUE
    ,zsDescripcion    VARCHAR(100) NULL
    ,zsEstado         VARCHAR(1)  NOT NULL DEFAULT 'A'
    ,zsFechaCreacion  DATETIME NOT NULL  DEFAULT (datetime('now','localtime'))
    ,zsFechaModifica  DATETIME NOT NULL  DEFAULT (datetime('now','localtime'))
);

CREATE TABLE zsAlimentoTipo (
     zsIdAlimentoTipo INTEGER PRIMARY KEY AUTOINCREMENT     
    ,zsNombre         VARCHAR(15) NOT NULL UNIQUE
    ,zsDescripcion    VARCHAR(100) NULL
    ,zsEstado         VARCHAR(1)  NOT NULL DEFAULT 'A'
    ,zsFechaCreacion  DATETIME NOT NULL  DEFAULT (datetime('now','localtime'))
    ,zsFechaModifica  DATETIME NOT NULL  DEFAULT (datetime('now','localtime'))
);

CREATE TABLE zsEstado (
     zsIdEstado       INTEGER PRIMARY KEY AUTOINCREMENT     
    ,zsNombre         VARCHAR(15) NOT NULL UNIQUE
    ,zsDescripcion    VARCHAR(100) NULL
    ,zsEstado         VARCHAR(1)  NOT NULL DEFAULT 'A'
    ,zsFechaCreacion  DATETIME NOT NULL  DEFAULT (datetime('now','localtime'))
    ,zsFechaModifica  DATETIME NOT NULL  DEFAULT (datetime('now','localtime'))
);

CREATE TABLE zsSexo (
     zsIdSexo         INTEGER PRIMARY KEY AUTOINCREMENT
    ,zsNombre         VARCHAR(15) NOT NULL UNIQUE
    ,zsDescripcion    VARCHAR(100) NULL
    ,zsEstado         VARCHAR(1)  NOT NULL DEFAULT 'A'
    ,zsFechaCreacion  DATETIME NOT NULL  DEFAULT (datetime('now','localtime'))
    ,zsFechaModifica  DATETIME NOT NULL  DEFAULT (datetime('now','localtime'))
);



CREATE TABLE zsCatalogo (
     zsIdCatalogo         INTEGER PRIMARY KEY AUTOINCREMENT
    ,zsIdCatalogoPadre    INTEGER 
    ,zsNombre             VARCHAR(20) NOT NULL  UNIQUE
    ,zsDetalle            VARCHAR(20)  
    zs
    ,zsEstado             VARCHAR(1) NOT NULL DEFAULT ('A')
    ,zsFechaCreacion      DATETIME NOT NULL  DEFAULT (datetime('now','localtime'))
    ,zsFechaModifica      DATETIME 
);