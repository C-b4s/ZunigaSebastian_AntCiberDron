-- database: ..\Databases\ZSAnt.sqlite
-- © 2K26 ❱──👾──❰ c_bit

INSERT INTO zsSexo (zsNombre, zsDescripcion) VALUES
     ('Macho', 'Hormiga de sexo masculino')
    ,('Hembra', 'Hormiga de sexo femenino')
    ,('Asexual', 'Hormiga sin sexo definido');

INSERT INTO zsHormigaTipo (zsNombre, zsDescripcion) VALUES
    ('Larva', 'Hormiga en etapa de larva')
   ,('Obrera', 'Hormiga encargada de los labores de la colonia')
   ,('Soldado', 'Hormiga encargada de la defensa de la colonia');

INSERT INTO zsAlimentoTipo (zsNombre, zsDescripcion) VALUES
    ('Nectar', 'Alimento líquido producido por las flores')
   ,('Carne', 'Alimento sólido de origen animal')
   ,('Hierba', 'Alimento sólido de origen vegetal');

INSERT INTO zsEstado (zsNombre, zsDescripcion) VALUES
     ('Vivo', 'La hormiga está viva y activa')
    ,('Muerto', 'La hormiga ha fallecido');


INSERT INTO zsHormiga (
     zsIdHormigaTipo
    ,zsIdSexo
    ,zsIdEstado
    ,zsNombre
    ,zsDescripcion
) VALUES
 (1, 1, 1, 'Aurelia',   'Hormiga exploradora con gran capacidad de adaptación táctica'  )
,(2, 2, 1, 'Bruno'  ,   'Unidad de fuerza en entrenamiento para misiones de resistencia')
,(3, 3, 1, 'Celia'  ,   'Hormiga analítica usada para simulaciones estratégicas'        )
,(1, 1, 1, 'Dario'  ,   'Especializada en reconocimiento de terreno complejo'           )
,(2, 2, 1, 'Elena'  ,   'Prototipo en entrenamiento con mejoras cibernéticas iniciales' )
,(3, 3, 1, 'Fabio'  ,   'Unidad de apoyo táctico en fase de aprendizaje'                )
,(1, 1, 1, 'Gaia'   ,   'Hormiga veloz destinada a misiones de infiltración'            )
,(2, 2, 1, 'Hector' ,   'Modelo experimental para combate coordinado'                   )
,(3, 3, 1, 'Irene'  ,   'Hormiga con sensores avanzados en proceso de calibración'      )
,(1, 1, 1, 'Julio'  ,   'Unidad ligera preparada para evolución a AntCiberDron'        );
