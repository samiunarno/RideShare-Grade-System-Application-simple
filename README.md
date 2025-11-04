## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

/**
 * [Short Title] - Brief one-line summary of what this code/file/module does.
 *
 * Detailed description:
 * - Explain the purpose and high-level behavior.
 * - Describe important design decisions, assumptions, and side effects.
 * - Mention expected inputs, outputs, and external dependencies (APIs, environment variables, files, network).
 *
 * Usage:
 * - Show typical usage snippet (how to call or import).
 *   Example:
 *     // language-specific example
 *     const result = functionName(arg1, arg2);
 *
 * Parameters:
 * - paramName (type): Short description of the parameter, valid values, units, and whether optional.
 * - anotherParam (type, optional): Description and default value if omitted.
 *
 * Returns:
 * - (type): Description of return value(s). If multiple values, enumerate them.
 *
 * Errors / Exceptions:
 * - List possible exceptions or error codes and conditions under which they occur.
 *   - ErrorType/Code: When it happens and recommended handling.
 *
 * Side Effects:
 * - Describe mutations (file/DB writes, global state changes), network calls, or resource usage.
 *
 * Performance:
 * - Time complexity, memory characteristics, and any important performance considerations.
 * - Recommended limits (e.g., batch sizes, concurrency levels).
 *
 * Thread-safety / Concurrency:
 * - Whether the code is safe to call from multiple threads or processes, and any synchronization requirements.
 *
 * Security:
 * - Any security considerations: input validation, escaping, authentication/authorization, secrets handling.
 *
 * Configuration / Setup:
 * - Required environment variables, config files, CLI flags, or build steps.
 * - Version requirements for runtimes or external libraries.
 * - Example setup:
 *     export API_KEY=...
 *     pip install -r requirements.txt
 *
 * Testing:
 * - How to run unit/integration tests and any special test setup (mocks, fixtures).
 * - Example test command.
 *
 * Examples:
 * - Provide one or two concrete examples with expected outputs and edge-case demonstrations.
 *
 * Notes:
 * - Known limitations, TODOs, and pointers to related modules or documentation.
 *
 * Licensing & Attribution:
 * - Short note on license and third-party attributions if applicable.
 *
 * Contact / Maintainers:
 * - Name(s) or team responsible and preferred contact method for issues.
 *
 * Replace bracketed placeholders with concrete values from the selected code.
 */
Documentation: Folder Structure

Purpose:
Provide a clear, concise overview of the repository layout so contributors and users can quickly find source code, tests, documentation, configuration, and build artifacts.

What to include in this section:
- A short description of the role/purpose of each top-level folder and notable files.
- A minimal visual tree showing the main folders (helps quick scanning).
- Notes about where to run/build/test the project and any important files (e.g., entrypoints, config templates).
- Any folders that are generated (build, dist) and should be ignored by version control.
- Links to deeper documentation (e.g., docs/, API reference) or contribution guidelines.

Suggested template (replace placeholders with project-specific names and descriptions):
- src/ or backend/        — server-side source code and services; entrypoint: <file>
- frontend/               — client-side UI source; build instructions: <command>
- tests/                  — unit and integration tests; run: <test command>
- docs/                   — design docs, API reference, user guides
- scripts/                — helper scripts for setup, migrations, deployments
- data/ or fixtures/      — sample datasets, test fixtures (if applicable)
- config/                 — configuration files and examples (.env.example)
- build/ or dist/         — generated artifacts (do not commit)
- .github/                — CI workflows and issue/PR templates
- README.md, LICENSE      — project overview and licensing

Minimal example tree to include (optional):
/ (project root)
├─ backend/          # API, server-side code
├─ frontend/         # client application
├─ tests/            # test suites
├─ docs/             # documentation
├─ scripts/          # helper utilities
└─ README.md

Guidelines:
- Keep the folder descriptions short (1–2 lines each).
- Update this section whenever the repository layout changes.
- Point to more detailed docs for complex areas (e.g., CONTRIBUTING.md, docs/architecture.md).
-->
## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
