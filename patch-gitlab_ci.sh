# #!/bin/bash

# Arguments that would be passed in by the person executing the script: 
# - string & file path
# We know the structure is always going to be 
# trigger: followed by project: on the next line so I'm adding one
new_project=$1

file_path=$2 # this needs to be more dynamic

# Use awk to find the line number of "trigger:" and then add 1 to get the line number of "project:"
line_numbers=$(awk '/trigger:/{print NR+1}' $file_path)

# Use sed to replace 'continuous-delivery' with the new project name on the specific line
for line in $line_numbers
do
  # Use sed to replace 'continuous-delivery' with the new project name on each line
  sed -i "${line}s|continuous-delivery|$new_project|" $file_path
done