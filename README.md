# Android

## Relay Support

- Hedgehog down to Electric Eel
- Not supported in Iguana
- Gradle Version: 8.2.2
- Kotlin Version: 1.9.22
- Does not support latest versions

## Git Scrub history

- Remove a File from History
    - git filter-branch --force --index-filter 'git rm --cached --ignore-unmatch secret.txt'
      --prune-empty --tag-name-filter cat -- --all
- Rewrite Commit Author Information
    ```
    git filter-branch --commit-filter '
    if [ "$GIT_COMMITTER_NAME" = "Old Name" ];
    then
        GIT_COMMITTER_NAME="New Name";
        GIT_AUTHOR_NAME="New Name";
        GIT_COMMITTER_EMAIL="newemail@example.com";
        GIT_AUTHOR_EMAIL="newemail@example.com";
        git commit-tree "$@";
    else
        git commit-tree "$@";
    fi' -- --all
    ```
- Change the Path of a File
    ```
    git filter-branch --tree-filter '
    if [ -f old/path/file.txt ]; then
        mkdir -p new/path
        mv old/path/file.txt new/path/file.txt
    fi' -- --all
    ```
- Remove All Commits by a Specific Author
    ```
    git filter-branch --commit-filter '
    if [ "$GIT_AUTHOR_EMAIL" = "author@example.com" ]; then
        skip_commit "$@";
    else
        git commit-tree "$@";
    fi' -- --all
    ```

## Post History Change

- Clean up the temporary history created during the filter-branch process
    - rm -rf .git/refs/original/
    - git reflog expire --expire=now --all
    - git gc --prune=now
- Force push the changes to your repository
    - git push origin --force --all
    - git push origin --force --tags

## Alternatives

- Example of using `git filter-repo`
    - install `git-filter-repo`
        - pip install git-filter-repo
    - remove a file using `git filter-repo`
        - git filter-repo --path secret.txt --invert-paths

## Resources

- [Codelab](https://codelabs.developers.google.com/relay-complete-app#0)
- [Relay](https://relay.material.io/)
- [Relay Basic Tutorial](https://developer.android.com/develop/ui/compose/tooling/relay/basic-tutorial)
- [Install Relay](https://developer.android.com/develop/ui/compose/tooling/relay/install-relay)
- [Material Design 3](https://developer.android.com/develop/ui/compose/designsystems/material3)
