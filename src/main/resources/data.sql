
/*
    CREATE USER DATABASE urna
    default chacacter set utf8
    default collate utf8_general_ci;

    CREATE TABLE candidato(
        id  ;
        codigo_votacao int (2) NOT NULL PRIMARY KEY;
        nome_candidato VARCHAR (100) NOT NULL;
        partido VARCHAR (50) NOT NULL;
        voto BOOLEAN NOT NULL DEFAULT TRUE;
        votoTotal BOOLEAN NOT NULL DEFAULT TRUE;
    );
    INSERT INTO tb_candidato(id, codigo_votacao, nome_candidato, partido, voto(s), votoTotal) VALUES(id, 12,'Marta', "PL", "voto", "votoTotal");
    tb_candidato(id, codigo_votacao, nome_candidato, partido, voto(s), votoTotal) VALUES(id, 16,'José', "PMDM", "voto", "votoTotal");
    tb_candidato(id, codigo_votacao, nome_candidato, partido, voto(s), votoTotal) VALUES(id, 18,'Roberto', "PT", "voto", "votoTotal");
    tb_candidato(id, codigo_votacao, nome_candidato, partido, voto(s), votoTotal) VALUES(id, 20,'Maria Silva', "PR", "voto", "votoTotal");
*/