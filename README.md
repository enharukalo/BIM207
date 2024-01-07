# hello-world

This is a simple Java console application that allows users to choose a language and receive a greeting message in that language. The project uses the JCommander library for parsing command line arguments and is built with Maven.

![helloWorld 1 0](https://github.com/enharukalo/hello-world/assets/28190290/8f6c50c1-278d-476a-8e2d-60c9db65cdb2)

## Usage

To run the application, follow these steps:

```bash
git clone https://github.com/enharukalo/hello-world.git
cd hello-world
mvn clean package
cd target
java -jar "hello-world-1.0.jar" -l <language-code>
```
Replace `<language-code>` with the desired language code (e.g., "en" for English, "de" for German).

## Command Line Arguments

- `-l`, `--lang`, `--language`, `/lang`: Choose a language (required).
- `-h`, `--help`, `/?`: Display the help message.

## Supported Languages

The application supports the following languages:

- English (`en`)
- German (`de`)
- Spanish (`es`)
- French (`fr`)
- Italian (`it`)
- Russian (`ru`)
- Turkish (`tr`)

## Maven Dependencies

- [JCommander](http://jcommander.org/): Command line parsing library.