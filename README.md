# CI Lab — Java + Maven + JUnit + GitHub Actions

This is a ready starter project for practicing **Continuous Integration (CI)** with **GitHub Actions**.

## What’s inside
- Java 17 + Maven
- JUnit 5 tests
- GitHub Actions workflow: `.github/workflows/ci.yml`
- Sample code with both passing and failing tests (toggle as needed)

## Quick Start
1. Create a **new GitHub repository** (empty).
2. Download this ZIP and extract it locally.
3. In the project folder, initialize and push to your repo:
   ```bash
   git init
   git add .
   git commit -m "CI Lab starter"
   git branch -M main
   git remote add origin https://github.com/<your-username>/<your-repo>.git
   git push -u origin main
   ```
4. Open your repo on GitHub → **Actions** tab → watch the CI run.
5. Fix tests or code until the workflow turns ✅ **green**.

## Local run
```bash
mvn -v
mvn clean test
```

## Build badge (paste in your README after first push)
```markdown
![Build](https://github.com/<your-username>/<your-repo>/actions/workflows/ci.yml/badge.svg)
```

## Coverage (optional)
- Add JaCoCo plugin to `pom.xml` and run `mvn verify`.
- Upload coverage to Codecov if you have a Codecov account.
