-- v1.3.0 - 10/06/2024

ALTER TABLE cidade DROP COLUMN longitude;
ALTER TABLE cidade DROP COLUMN latitude;

INSERT INTO cidade (id, nome, uf, ibge, lat_lon, cod_tom) VALUES (5610, 'Angicos', 20, 2400802, '(-5.661865760608609, -36.60085204710061)', 1615);

ALTER TABLE pais ADD ddi int4 NULL;

UPDATE pais SET nome_pt='Anguila', ddi=1 WHERE id=8;
UPDATE pais SET ddi=1, nome_pt='Canadá' WHERE id=38;
UPDATE pais SET nome_pt='Ilhas Caimã', ddi=1 WHERE id=40;
UPDATE pais SET ddi=27 WHERE id=195;
UPDATE pais SET ddi=377 WHERE id=143;
UPDATE pais SET ddi=39 WHERE id=107;
UPDATE pais SET ddi=55 WHERE id=1;
UPDATE pais SET ddi=54 WHERE id=11;
UPDATE pais SET ddi=61 WHERE id=14;
UPDATE pais SET ddi=7 WHERE id=178;
UPDATE pais SET ddi=81 WHERE id=109;
UPDATE pais SET ddi=91 WHERE id=101;
