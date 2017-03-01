# cuba-question-changelog-with-branch
A CUBA example that deals with the question with database changelog scripts in different branches

In the VCS we have a trunk based version and a 1.0.x branch.

Both contain 10.create-db.sql which will create a table customer (with a name attribute, length 255, not mandatory).

* on 2017-03-01 there is a 1.0.0 release and the branch 1.0.x gets created
* on 2017-03-02 there is a change in trunk which will increase the size of the name column to 4000
* on 2017-03-03 there is a change in 1.0.x which will define the name column as mandatory
* on 2017-03-04 there is a 1.0.1 release with the changes in branch but not in trunk

1.0.0 and 1.0.1 are now in production.

The question is how to deal with merging these changes.
