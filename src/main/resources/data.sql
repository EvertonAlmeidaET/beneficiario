INSERT INTO tb_beneficiario(nome, telefone, data_Nascimento, data_Inclusao, data_Atualizacao)  VALUES ('GUILHERME SANTOS', '112233-4455', '2002-10-25', '2024-07-08 01:00:00', '2024-07-08 05:53:10');
INSERT INTO tb_beneficiario(nome, telefone, data_Nascimento, data_Inclusao, data_Atualizacao)  VALUES ('EVERTON DE ALMEIDA', '113322-6655', '1996-01-07', '2024-07-08 01:00:00', '2024-07-08 05:53:10');
INSERT INTO tb_beneficiario(nome, telefone, data_Nascimento, data_Inclusao, data_Atualizacao)  VALUES ('MATEUS OLIVEIRA', '111122-8899', '1997-07-14', '2024-07-08 01:00:00', '2024-07-08 05:53:10');

INSERT INTO tb_documento(tipo_Documento, descricao, data_Inclusao, data_Atualizacao, id_beneficiario)  VALUES('PDF', 'DOCUMENTO PDF', '2024-07-08 01:00:00', '2024-07-08 05:53:10', 1);
INSERT INTO tb_documento(tipo_Documento, descricao, data_Inclusao, data_Atualizacao, id_beneficiario)  VALUES('CSV', 'DOCUMENTO EXCEL ESCRITO EM CSV', '2024-07-08 01:00:00', '2024-07-08 05:53:10', 1);
INSERT INTO tb_documento(tipo_Documento, descricao, data_Inclusao, data_Atualizacao, id_beneficiario)  VALUES('EXCEL', 'PLANILHA EXCEL', '2024-07-08 01:00:00', '2024-07-08 05:53:10', 2);
INSERT INTO tb_documento(tipo_Documento, descricao, data_Inclusao, data_Atualizacao, id_beneficiario)  VALUES('TXT', 'DOCUMENTO DE TEXTO', '2024-07-08 01:00:00', '2024-07-08 05:53:10', 3);