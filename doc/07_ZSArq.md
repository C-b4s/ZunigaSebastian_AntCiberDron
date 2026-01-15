App
│
├── ZSAppComponent                ← Capa de presentación (UI/UX)         │   │            
│   │   
│   └── ZSConsoleApp              ← App de terminal (usuario final)
│       └── ZSSistemaRuso.java  ← Punto de entrada
│       └── ZSKGD.java          ← Punto de entrada
│
├── ZSBusinessComponent              ← DomainComponent: Lógica de negocio
│   ├── ZSInterfaces                 ← Contratos de comportamiento 
│   ├── ZSServices                   ← Reglas de negocio
│   └── ZSEntities                   ← Domain Models 
│        │── ZSEntomologo.java     ← Clase abstracta de Entomologo
│        │        └── ZSEnt.java
│        │        └── ZSEntGen.java
│         └── ZSGenoAlimento.java
│                └── ZSX.java  
│                └── ZSXX.java 
│                └── ZSXY.java 
│
├── DataAccessComponent          ← Persistencia
│   ├── ZSInterfaces              ← Contratos (Repositories / DAOs)
│   ├── ZSDAOs                    ← Implementaciones
│   ├── ZSDTOs                    ← Objetos de transporte
│   └── ZSHelpers                 ← Mappers / utilidades DB
│
└── InfrastructureComponent      ← Preocupaciones transversales
    ├── ZSConfig                  ← Configuración
    ├── ZSLogging                 ← Logs
    └── ZSTools                   ← Utilidades comunes
