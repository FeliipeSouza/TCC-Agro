# TCC-Agro

Entidades:

Animal
Touro
Inseminação
Observação
Atributos das Entidades:

Animal:

ID (Identificação no sistema, chave primária)
Nome Fantasia
Nome Ou Numeração
Parto
NumLac (Número de lactações)
Ultima Cobertura
NumIA (Número de inseminações)
Status
IEP (Intervalo entre partos)
DA (Dias até emprenhar)
DiasGest (Dias de gestação)
Previsao Parto
Pre Parto
Data Secagem

Touro:

ID (Chave primária)
Nome Fantasia
Quantidade Material Genetico
Nome Fazenda
Status

Inseminação:

ID (Chave primária)
IDAnimal (Chave estrangeira referenciando Animal)
IDTouro (Chave estrangeira referenciando Touro)
DataInseminacao

Observação:

ID (Chave primária)
IDAnimal (Chave estrangeira referenciando Animal)
Observacao
