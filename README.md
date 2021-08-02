# Elune

Elune is a domain-specific language (DSL) created for the purpose of creating game modifications that was developed as the subject of my degree's dissertation.

Elune is a dynamically typed which primarily aims to address the shortcomings of the most dominant programming language currently used for this purpose — **Lua**. The syntax takes inspiration from Python and C-based languages, and thus aims to follow more standard programming language conventions (e.g. C-style for loops and zero indexing).

The language is made up of several components:

- A **grammar** defined in an ANTLR g4 format.
- A **translator**/**compiler** written in Java that translates the Elune code into the target language.
- A **template** that defines the output of the translation, which makes use of the StringTemplate template engine. Currently, the only existing working template is for Lua, as there are some aspects of the translator that are currently hard-coded which would first need to be abstracted in order to make the idea of retargeting the language feasible.
- **Libraries** which provide additional functionality.

In particular, a **Generic API** library was created in order to try and generalise APIs across games. The idea is that a single **API Dispatcher** exists to handle any interaction with the game's API, which connects to an **API Adaptor** that is hand-coded to needs of each game.

For instance, the call:

```C_Calendar.GetNumInvites()```

in the World of Warcraft API (https://wowpedia.fandom.com/wiki/API_C_Calendar.GetNumInvites) would become:

```wow:get("numInvites")```

This concept would likely be the primary focus of any future work, since the API and its lack of documentation was by far the most common complaint I heard from modders when performing my research for this project.

**Github**: https://github.com/DanBest21/elune

## Instructions

In order to run the translator, use the following command:

```java -jar Elune.jar <source_file> <output_path> <language> <continue_keyword_toggle> <imports_toggle>```

where:

- `<source_file>` is the `.elu` file that you wish to translate.
- `<output_path>` is the directory you wish the translated file to be generated at.
- `<language>` is the programming language you want the file to be translated to (currently only `lua` will work).
- `<continue_keyword_toggle>` can be toggled `off`, which will disable the continue keyword from working in the language, since Lua in some games does not allow for the use of labels.
- `<imports_toggle>` can be toggled `off`, which will disable the ability to import libraries, since Lua in some game does not allow for the use of the `require` keyword.

## Credits

I would like to thank my supervisor Dr Julian Rathke for all his help and support on this project. I would also like to thank Terence Parr for the **ANTLR** (https://www.antlr.org/) and **StringTemplate** (https://www.stringtemplate.org/) tools, which were instrumental to this project's success. Finally, I would like to credit Leafo's **MoonScript** (https://moonscript.org/), which I took inspiration from when designing the grammar.
