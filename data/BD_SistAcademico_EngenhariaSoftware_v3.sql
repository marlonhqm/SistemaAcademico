-- -----------------------------------------------------
-- Siscad
-- -----------------------------------------------------
CREATE DATABASE Siscad;
USE Siscad ;

-- -----------------------------------------------------
-- Table Siscad.Professor
-- -----------------------------------------------------
CREATE TABLE Siscad.Professor (
  Cod_Prof INT NOT NULL,
  Nom_Prof VARCHAR(50) NOT NULL,
  End_Prof VARCHAR(100) NOT NULL,
  Des_Num_Telefone VARCHAR(20) NULL,
  Des_Titulacao VARCHAR(45) NULL,
  PRIMARY KEY (Cod_Prof))
;


-- -----------------------------------------------------
-- Table Siscad.Coordenador
-- -----------------------------------------------------
CREATE TABLE Siscad.Coordenador (
  Cod_Prof INT NOT NULL,
  PRIMARY KEY (Cod_Prof),
  CONSTRAINT Cod_Prof_FK
    FOREIGN KEY (Cod_Prof)
    REFERENCES Siscad.Professor (Cod_Prof))
;


-- -----------------------------------------------------
-- Table Siscad.Curso
-- -----------------------------------------------------
CREATE TABLE Siscad.Curso (
  Cod_Curso INT NOT NULL,
  Nom_Curso VARCHAR(45) NOT NULL,
  Des_Curso VARCHAR(100) NOT NULL,
  Cod_Prof_Coordenador INT NOT NULL,
  PRIMARY KEY (Cod_Curso),
  CONSTRAINT Cod_Prof_Coordenador_FK
    FOREIGN KEY (Cod_Prof_Coordenador)
    REFERENCES Siscad.Coordenador (Cod_Prof))
;


-- -----------------------------------------------------
-- Table Siscad.Turma
-- -----------------------------------------------------
CREATE TABLE Siscad.Turma (
  Cod_Turma INT NOT NULL,
  Des_Ano CHAR(10) NOT NULL,
  Des_Semestre CHAR(10) NOT NULL,
  Des_DiaAula VARCHAR(45) NOT NULL,
  Des_HorarioAula VARCHAR(45) NOT NULL,
  PRIMARY KEY (Cod_Turma))
;


-- -----------------------------------------------------
-- Table Siscad.Aluno
-- -----------------------------------------------------
CREATE TABLE Siscad.Aluno (
  Cod_Aluno INT NOT NULL,
  Nom_Aluno VARCHAR(50) NOT NULL,
  End_Aluno VARCHAR(100) NOT NULL,
  Des_Num_Telefone VARCHAR(45) NULL,
  Des_Situacao VARCHAR(45) NOT NULL,
  Cod_Curso_FK INT NOT NULL,
  Cod_Turma_FK INT NOT NULL,
  PRIMARY KEY (Cod_Aluno),
  CONSTRAINT Cod_Curso_FK
    FOREIGN KEY (Cod_Curso_FK)
    REFERENCES Siscad.Curso (Cod_Curso),
  CONSTRAINT Cod_Turma_FK
    FOREIGN KEY (Cod_Turma_FK)
    REFERENCES Siscad.Turma (Cod_Turma))
;


-- -----------------------------------------------------
-- Table Siscad.Disciplina
-- -----------------------------------------------------
CREATE TABLE Siscad.Disciplina (
  Cod_Disciplina INT NOT NULL,
  Nom_Disciplina VARCHAR(45) NOT NULL,
  Des_Disciplina VARCHAR(100) NOT NULL,
  Des_CargaHoraria VARCHAR(15) NOT NULL,
  Des_Ementa VARCHAR(45) NOT NULL,
  Des_Bibliografia VARCHAR(45) NOT NULL,
  Des_PreReq VARCHAR(45) NULL,
  PRIMARY KEY (Cod_Disciplina))
;


-- -----------------------------------------------------
-- Table Siscad.Avaliacao
-- -----------------------------------------------------
CREATE TABLE Siscad.Avaliacao (
  Cod_Av INT NOT NULL,
  Des_Av VARCHAR(45) NOT NULL,
  Des_NotaAv CHAR(10) NOT NULL,
  Des_Nota_Aluno CHAR(10) NOT NULL,
  Cod_Disciplina INT NOT NULL,
  Cod_Aluno INT NOT NULL,
  PRIMARY KEY (Cod_Av),
  CONSTRAINT Cod_Disciplina_FK
    FOREIGN KEY (Cod_Disciplina)
    REFERENCES Siscad.Disciplina (Cod_Disciplina),
  CONSTRAINT Cod_Aluno_FK
    FOREIGN KEY (Cod_Aluno)
    REFERENCES Siscad.Aluno (Cod_Aluno))
;

-- -----------------------------------------------------
-- Table Siscad.Curso_Disciplina
-- -----------------------------------------------------
CREATE TABLE Siscad.Curso_Disciplina (
  Curso_Cod_Curso INT NOT NULL,
  Disciplina_Cod_Disciplina INT NOT NULL,
  PRIMARY KEY (Curso_Cod_Curso, Disciplina_Cod_Disciplina),
  CONSTRAINT Cod_Curso_FK
    FOREIGN KEY (Curso_Cod_Curso)
    REFERENCES Siscad.Curso (Cod_Curso),
  CONSTRAINT Cod_Disciplina_FK
    FOREIGN KEY (Disciplina_Cod_Disciplina)
    REFERENCES Siscad.Disciplina (Cod_Disciplina))
;


-- -----------------------------------------------------
-- Table Siscad.Professor_Curso
-- -----------------------------------------------------
CREATE TABLE Siscad.Professor_Curso (
  Cod_Prof INT NOT NULL,
  Cod_Curso INT NOT NULL,
  PRIMARY KEY (Cod_Prof, Cod_Curso),
  CONSTRAINT Cod_Prof_FK
    FOREIGN KEY (Cod_Prof)
    REFERENCES Siscad.Professor (Cod_Prof),
  CONSTRAINT Cod_Curso_FK
    FOREIGN KEY (Cod_Curso)
    REFERENCES Siscad.Curso (Cod_Curso))
;


-- -----------------------------------------------------
-- Table Siscad.Turma_has_Disciplina
-- -----------------------------------------------------
CREATE TABLE Siscad.Turma_has_Disciplina (
  Cod_Turma INT NOT NULL,
  Cod_Disciplina INT NOT NULL,
  PRIMARY KEY (Cod_Turma, Cod_Disciplina),
  CONSTRAINT Cod_Turma_FK
    FOREIGN KEY (Cod_Turma)
    REFERENCES Siscad.Turma (Cod_Turma),
  CONSTRAINT Cod_Disciplina_FK
    FOREIGN KEY (Cod_Disciplina)
    REFERENCES Siscad.Disciplina (Cod_Disciplina))
;


-- -----------------------------------------------------
-- Table Siscad.Professor_has_Turma
-- -----------------------------------------------------
CREATE TABLE Siscad.Professor_has_Turma (
  Cod_Prof INT NOT NULL,
  Cod_Turma INT NOT NULL,
  PRIMARY KEY (Cod_Prof, Cod_Turma),
  CONSTRAINT Cod_Prof_FK
    FOREIGN KEY (Cod_Prof)
    REFERENCES Siscad.Professor (Cod_Prof),
  CONSTRAINT Cod_Turma_FK
    FOREIGN KEY (Cod_Turma)
    REFERENCES Siscad.Turma (Cod_Turma))
;


-- -----------------------------------------------------
-- Table Siscad.Frequencia_Aluno_Disciplina
-- -----------------------------------------------------
CREATE TABLE Siscad.Frequencia_Aluno_Disciplina (
  Dta_Aula DATETIME NOT NULL,
  Ind_Frequencia TINYINT NOT NULL,
  Disciplina_Cod_Disciplina INT NOT NULL,
  Aluno_Cod_Aluno INT NOT NULL,
  PRIMARY KEY (Dta_Aula),
  CONSTRAINT fk_Frequencia_Aluno_Disciplina_Disciplina1
    FOREIGN KEY (Disciplina_Cod_Disciplina)
    REFERENCES Siscad.Disciplina (Cod_Disciplina),
  CONSTRAINT fk_Frequencia_Aluno_Disciplina_Aluno1
    FOREIGN KEY (Aluno_Cod_Aluno)
    REFERENCES Siscad.Aluno (Cod_Aluno))
;