#!/bin/bash

# Goal of script is to find occurences of a string in a yml file
file="*.yml"

search_string="<string to search>"

directory_to_search=$1


find $directory_to_search -name $file -exec grep -nH "$search_string" {} \; | awk -F: '{print $1 " → line " $2}'