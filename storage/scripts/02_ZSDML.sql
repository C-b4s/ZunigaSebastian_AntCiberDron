-- database: ..\Databases\ZSAnt.sqlite
-- © 2K26 ❱──👾──❰ c_bit


INSERT INTO ZSAlimentoTipo (zsNombre, zsDescripcion) VALUES
    ('Carnivoro', 'Alimento sólido de origen animal')
   ,('Herbívoro', 'Alimento sólido de origen vegetal')
   ,('Omnívoro', 'Alimento sólido de origen mixto')
   ,('Nectarívoro', 'Alimento líquido derivado de flores');

INSERT INTO ZSHormigaTipo (zsNombre, zsDescripcion) VALUES
    ('Larva', 'Hormiga en etapa de larva')
   ,('Soldado', 'Hormiga encargada de la defensa de la colonia')
   ,('Obrera', 'Hormiga encargada de los labores de la colonia')
   ,('Rastreadora','Hormiga especializada en la exploración y búsqueda de recursos')
   ,('Reina','Hormiga encargada de la reproducción y fecundación de las nuevas colonias')
   ,('Zángano','Hormiga macho cuya función principal es la reproducción');

INSERT INTO ZSSexo (zsNombre, zsDescripcion) VALUES
     ('Macho', 'Hormiga de sexo masculino')
    ,('Hembra', 'Hormiga de sexo femenino')
    ,('Asexual', 'Hormiga sin sexo definido')
    ,('Híbrido', 'Hormiga con características de ambos sexos');

INSERT INTO ZSEstado (zsNombre, zsDescripcion) VALUES
     ('Vive', 'La hormiga está viva y activa')
    ,('Muere', 'La hormiga ha fallecido');

INSERT INTO ZSAlimento(IdZSAlimentoTipo, zsNombre, zsDescripcion) VALUES
     (1,'Insectos Pequeños', 'Fuente rica en proteínas para las hormigas carnivoras'        )
    ,(2,'Hojas Frescas'    , 'Alimento básico para las hormigas herbívoras'                 )
    ,(3,'Frutas Mixtas'    , 'Combinación de frutas para hormigas omnívoras'                )
    ,(4,'Néctar de Flores' , 'Fuente líquida de energía para las hormigas nectarívoras'     )
    ,(2,'Semillas'         , 'Alimento con nutrientes para las hormigas herbívoras'         )
    ,(4,'Miel'             , 'Alimento líquido dulce para hormigas nectarívoras'            )
    ,(1,'Gusanos'          , 'Alimento proteico para hormigas carnívoras '                  )
    ,(4,'Savia de plantas' , 'Alimento líquido para hormigas nectarívoras'                  )
    ,(2,'Pasto'            , 'Alimento sólido para hormigas herbívoras'                     )
    ,(3,'Migas de pan'     , 'Alimento sólido para hormigas omnívoras'                      );


INSERT INTO zsHormiga (
     IdZSHormigaTipo
    ,IdZSSexo
    ,IdZSEstado
    ,zsNombre
    ,zsDescripcion
) VALUES
     (1, 2, 1, 'Aurelia',   'Hormiga exploradora con gran capacidad de adaptación táctica'  )
    ,(2, 1, 1, 'Bruno'  ,   'Unidad de fuerza en entrenamiento para misiones de resistencia')
    ,(3, 3, 1, 'Celia'  ,   'Hormiga analítica usada para simulaciones estratégicas'        )
    ,(4, 4, 1, 'Dario'  ,   'Especializada en reconocimiento de terreno complejo'           )
    ,(5, 2, 1, 'Elena'  ,   'Prototipo en entrenamiento con mejoras cibernéticas iniciales' )
    ,(6, 1, 1, 'Fabio'  ,   'Unidad de apoyo táctico en fase de aprendizaje'                )
    ,(1, 3, 1, 'Gaia'   ,   'Hormiga veloz destinada a misiones de infiltración'            )
    ,(2, 4, 1, 'Hector' ,   'Modelo experimental para combate coordinado'                   )
    ,(3, 2, 1, 'Irene'  ,   'Hormiga con sensores avanzados en proceso de calibración'      )
    ,(4, 1, 1, 'Julio'  ,   'Unidad ligera preparada para evolución a AntCiberDron'         )
    ,(3, 3, 1, 'Kira'   ,   'Hormiga de apoyo logístico en fase de pruebas iniciales'       )
    ,(6, 4, 1, 'Luca'   ,   'Prototipo de hormiga táctica en entrenamiento avanzado'        );

INSERT INTO ZSHormigaAlimento (
     IdZSHormiga
    ,IdZSAlimento
    ,zsDescripcion
) VALUES
     (1, 1, 'Aurelia consume insectos pequeños durante exploraciones prolongadas')
    ,(1, 4, 'Aurelia se alimenta de néctar para recuperar energía rápidamente')
    ,(2, 7, 'Bruno ingiere gusanos para aumentar su fuerza física')
    ,(3, 3, 'Celia consume frutas mixtas mientras realiza análisis estratégicos')
    ,(4, 2, 'Dario se alimenta de hojas frescas durante misiones de reconocimiento')
    ,(5, 6, 'Elena utiliza miel como fuente energética en su entrenamiento')
    ,(6, 10,'Fabio consume migas de pan como dieta omnívora básica')
    ,(7, 8, 'Gaia se alimenta de savia de plantas durante infiltraciones')
    ,(8, 5, 'Hector consume semillas para mantener resistencia prolongada')
    ,(9, 9, 'Irene se alimenta de pasto como parte de pruebas de adaptación');

INSERT INTO ZSAntCiberDron (ZSSerie) VALUES
     ('IA-01')
    ,('IA-02')
    ,('IA-03')
    ,('IA-04')
    ,('IA-05')
    ,('IA-06')
    ,('IA-07')
    ,('IA-08')
    ,('IA-09')
    ,('IA-10');

INSERT INTO ZSHormigaAntCiberDron (
     IdZSHormiga
    ,IdZSAntCiberDron
    ,zsDescripcion
) VALUES
 (1, 1, 'Aurelia utiliza la serie IA-01 como caparazón táctico para exploración'           )
,(2, 2, 'Bruno opera con el AntCiberDron IA-02, aumentando resistencia física'             )
,(3, 3, 'Celia emplea la serie IA-03 para soporte analítico y simulaciones estratégicas'   )
,(4, 4, 'Dario usa el IA-04 como exoesqueleto para reconocimiento en terrenos complejos'   )
,(5, 5, 'Elena se encuentra en fase de integración con el AntCiberDron IA-05 '             )
,(6, 6, 'Fabio utiliza la serie IA-06 como unidad de apoyo y estabilización operativa'     )
,(7, 7, 'Gaia opera con el IA-07, optimizado para velocidad, sigilo e infiltración'        )
,(8, 8, 'Hector emplea el AntCiberDron IA-08 para combate coordinado y control táctico'    )
,(9, 9, 'Irene utiliza la serie IA-09 para amplificación sensorial y recuperación asistida')
,(10,10,'Julio está enlazado al IA-10 como equipamiento bélico'                            );
