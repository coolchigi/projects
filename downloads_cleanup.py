import os
import shutil
from os.path import expanduser
from datetime import datetime, timedelta

downloads_dir = expanduser("~") + '/Downloads/'
to_delete_dir = downloads_dir + 'toDelete/'

if not os.path.exists(to_delete_dir):
    os.makedirs(to_delete_dir)

files = os.listdir(downloads_dir)
files.sort(key=lambda x: os.path.getmtime(downloads_dir + x))

# Get the current time and subtract 1 year
one_year_ago = datetime.now() - timedelta(days=365)

for file in files:
    file_time = datetime.fromtimestamp(os.path.getmtime(downloads_dir + file))
    # If the file is older than 1 year, move it to the toDelete folder
    if file_time < one_year_ago:
        shutil.move(downloads_dir + file, to_delete_dir + file)
