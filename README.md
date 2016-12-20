<!-- 
   Copyright 2013 Oto Soares Coelho Junior

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 -->
JEE 6 Enterprise (Multi-Module) Archetype
=========================================

[![Codacy Badge](https://api.codacy.com/project/badge/Grade/93cfdaa697c74ba38068392f86f5504a)](https://www.codacy.com/app/otojunior/jee-app-enterprise-archetype?utm_source=github.com&utm_medium=referral&utm_content=otojunior/jee-app-enterprise-archetype&utm_campaign=badger)
[![Build Status](https://travis-ci.org/otojunior/jee-app-enterprise-archetype.svg?branch=master)](https://travis-ci.org/otojunior/jee-app-enterprise-archetype)

1. Archetype Instalation and Use
--------------------------------

**Pre-Requisites:**

- JDK 6+
- Maven (3.x+)
- Git

**Install Steps:**

1. Download the archetype.
2. Install the archetype: mvn clean install

**Use Steps:**

1. Command: mvn archetype:generate -DarchetypeGroupId=org.otojunior.archetype -DarchetypeArtifactId=jee-app-enterprise-archetype -DarchetypeVersion=<archetype version> -DgroupId=<your company domain> -DartifactId=<your project> -Dversion=<your project verson> -Dpackage=<your project package> -Dmaven.test.skip=true -B

Parameters:
* archetypeGroupId: MUST BE org.otojunior.archetype
* archetypeArtifactId: MUST BE jee-app-simple
* archetypeVersion: Archetype version to use to creation.
* groupId: Your company domain in Iava convention. Ex.: com.acme
* artifactId: Your project name. Ex.: sampleproject
* version: Your first project version. Recommendation: 1.0-SNAPSHOT
* package: Default package of your application.

Obs.: In root archetype folder, there is a script to help this creation. Edit the script and put it into another folder. Ex.: the your root projects folder.

2. Logs Framework Configuration
-------------------------------

Log Framework: SLF4J (API) and Logback (Implementation). Supports many log appenders (destiny of messages): console, file, databases, etc. For logs in databases (DBAppender), the tables must be created first by scripts in:
* [Logback Scripts](https://github.com/qos-ch/logback/tree/v_1.1.1/logback-classic/src/main/java/ch/qos/logback/classic/db/script)

The JDBC drivers can be found in:
* [Maven Repository](http://search.maven.org)

3. Datasources Configuration
----------------------------

* [JBoss 7 Datasources Configurations](http://www.ironjacamar.org/doc/userguide/1.0/en-US/html/ex_datasources.html)

4. Deployment Descriptors JEE 7
----------------------------------

* [Deployment Descriptors JEE 7](https://dzone.com/articles/java-ee-7-deployment)

5. Observations
---------------

* Remember to update the <h:outputScript library="webjars" name="jquery/3.0.0/jquery.min.js" /> tag of the template.xhtml when update de jquery version in POM.
