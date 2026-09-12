# STEP SEM 3 - Week 2 Practice Problems

This repository contains standard Java implementations for the Week 2 live-coding session problem set.

## 📂 Included Problems & Files

1. **Vowel & Consonant Counter** (`VowelConsonantCounter.java`)
   * Iterates through characters of a string using `charAt()` to count vowels and consonants case-insensitively while ignoring spaces.

2. **CSV Student Record Parser** (`CSVStudentParser.java`)
   * Parses CSV string records using `split(",")`, validates required field counts, and formats output.

3. **File Extension Validator** (`FileExtensionValidator.java`)
   * Extracts file extensions using `lastIndexOf('.')` and `substring()`, validating them case-insensitively against allowed extensions (`pdf`, `docx`, `zip`).

4. **Masked Phone Number Formatter** (`PhoneNumberMasker.java`)
   * Validates 10-digit phone numbers and formats a masked version (`XXXXXX-1234`) using `StringBuilder`.

5. **Bank Transaction Reference Generator & Validator** (`TransactionReferenceValidator.java`)
   * Normalizes raw transaction reference inputs and validates structure (3 letters + 11 digits) using character classification methods without regular expressions.

## 🛠️ How to Run

Compile and execute any solution file using:

```bash
javac ClassName.java
java ClassName
