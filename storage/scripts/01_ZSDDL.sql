-- database: ..\Databases\ZSAnt.sqlite
-- © 2K26 ❱──👾──❰ c_bit

DROP TABLE IF EXISTS ZSHormigaAntCiberDron;
DROP TABLE IF EXISTS ZSAntCiberDron;
DROP TABLE IF EXISTS ZSHormigaAlimento;
DROP TABLE IF EXISTS ZSHormiga;
DROP TABLE IF EXISTS ZSAlimento;
DROP TABLE IF EXISTS ZSHormigaTipo;
DROP TABLE IF EXISTS ZSAlimentoTipo;
DROP TABLE IF EXISTS ZSSexo;
DROP TABLE IF EXISTS ZSEstado;


CREATE TABLE ZSAlimentoTipo (
     IdZSAlimentoTipo INTEGER PRIMARY KEY AUTOINCREMENT     
    ,zsNombre         VARCHAR(15) NOT NULL UNIQUE
    ,zsDescripcion    VARCHAR(100) NULL
    ,zsEstado         VARCHAR(1)  NOT NULL DEFAULT ('A')
    ,zsFechaCreacion  DATETIME NOT NULL  DEFAULT (datetime('now','localtime'))
    ,zsFechaModifica  DATETIME NOT NULL  DEFAULT (datetime('now','localtime'))
);

CREATE TABLE ZSHormigaTipo (
     IdZSHormigaTipo  INTEGER PRIMARY KEY AUTOINCREMENT     
    ,zsNombre         VARCHAR(15) NOT NULL UNIQUE
    ,zsDescripcion    VARCHAR(100) NULL
    ,zsEstado         VARCHAR(1)  NOT NULL DEFAULT ('A')
    ,zsFechaCreacion  DATETIME NOT NULL  DEFAULT (datetime('now','localtime'))
    ,zsFechaModifica  DATETIME NOT NULL  DEFAULT (datetime('now','localtime'))
);

CREATE TABLE ZSSexo (
     IdZSSexo         INTEGER PRIMARY KEY AUTOINCREMENT
    ,zsNombre         VARCHAR(15) NOT NULL UNIQUE
    ,zsDescripcion    VARCHAR(100) NULL
    ,zsEstado         VARCHAR(1)  NOT NULL DEFAULT ('A')
    ,zsFechaCreacion  DATETIME NOT NULL  DEFAULT (datetime('now','localtime'))
    ,zsFechaModifica  DATETIME NOT NULL  DEFAULT (datetime('now','localtime'))
);

CREATE TABLE ZSEstado (
     IdZSEstado       INTEGER PRIMARY KEY AUTOINCREMENT     
    ,zsNombre         VARCHAR(15) NOT NULL UNIQUE
    ,zsDescripcion    VARCHAR(100) NULL
    ,zsEstado         VARCHAR(1)  NOT NULL DEFAULT ('A')
    ,zsFechaCreacion  DATETIME NOT NULL  DEFAULT (datetime('now','localtime'))
    ,zsFechaModifica  DATETIME NOT NULL  DEFAULT (datetime('now','localtime'))
);


CREATE TABLE ZSAlimento (
         IdZSAlimento     INTEGER PRIMARY KEY AUTOINCREMENT
        ,IdZSAlimentoTipo INTEGER NOT NULL REFERENCES ZSAlimentoTipo (IdZSAlimentoTipo)
        ,zsNombre         VARCHAR(15) NOT NULL UNIQUE
        ,zsDescripcion    VARCHAR(100) NULL
        ,zsEstado         VARCHAR(1)  NOT NULL DEFAULT ('A')
        ,zsFechaCreacion  DATETIME NOT NULL  DEFAULT (datetime('now','localtime'))
        ,zsFechaModifica  DATETIME NOT NULL  DEFAULT (datetime('now','localtime'))
);

CREATE TABLE ZSHormiga (
     IdZSHormiga      INTEGER PRIMARY KEY AUTOINCREMENT
    ,IdZSHormigaTipo  INTEGER NOT NULL REFERENCES ZSHormigaTipo (IdZSHormigaTipo)
    ,IdZSSexo         INTEGER NOT NULL REFERENCES ZSSexo        (IdZSSexo)
    ,IdZSEstado       INTEGER NOT NULL REFERENCES ZSEstado      (IdZSEstado)
    ,zsNombre         VARCHAR(15) NOT NULL UNIQUE
    ,zsDescripcion    VARCHAR(100) NULL
    ,zsEstado         VARCHAR(1)  NOT NULL DEFAULT ('A')
    ,zsFechaCreacion  DATETIME NOT NULL  DEFAULT (datetime('now','localtime'))
    ,zsFechaModifica  DATETIME NOT NULL  DEFAULT (datetime('now','localtime'))
);

CREATE TABLE ZSHormigaAlimento (
         IdZSHormigaAlimento INTEGER PRIMARY KEY AUTOINCREMENT
        ,IdZSHormiga        INTEGER NOT NULL REFERENCES ZSHormiga (IdZSHormiga)
        ,IdZSAlimento      INTEGER NOT NULL REFERENCES ZSAlimento (IdZSAlimento)
        ,zsDescripcion   VARCHAR(100) NULL
        ,zsEstado          VARCHAR(1)  NOT NULL DEFAULT ('A')
        ,zsFechaCreacion   DATETIME NOT NULL  DEFAULT (datetime('now','localtime'))
        ,zsFechaModifica   DATETIME NOT NULL  DEFAULT (datetime('now','localtime'))
);

CREATE TABLE ZSAntCiberDron(
         IdZSAntCiberDron      INTEGER PRIMARY KEY AUTOINCREMENT
        ,zsSerie             VARCHAR(15) NOT NULL UNIQUE
        ,zsEstado              VARCHAR(1)  NOT NULL DEFAULT ('A')
        ,zsFechaCreacion       DATETIME NOT NULL  DEFAULT (datetime('now','localtime'))
        ,zsFechaModifica       DATETIME NOT NULL  DEFAULT (datetime('now','localtime'))
);

CREATE TABLE ZSHormigaAntCiberDron(
        IdZSHormigaAntCiberDron INTEGER PRIMARY KEY AUTOINCREMENT
         ,IdZSHormiga        INTEGER NOT NULL REFERENCES ZSHormiga (IdZSHormiga)
         ,IdZSAntCiberDron INTEGER NOT NULL REFERENCES ZSAntCiberDron (IdZSAntCiberDron)
         ,zsDescripcion VARCHAR(100) NULL
         ,zsEstado     VARCHAR(1)  NOT NULL DEFAULT ('A')
         ,zsFechaCreacion DATETIME NOT NULL DEFAULT (datetime('now','localtime'))
         ,zsFechaModifica DDATETIME NOT NULL DEFAULT (datetime('now','localtime'))
);
