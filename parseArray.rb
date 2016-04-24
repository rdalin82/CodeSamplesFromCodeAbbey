file = File.open(ARGV)

lines = file.readlines 

parse = lines.map{ |x| x.split(" ") } 

arr = []
 

File.write("parsed.txt", arr1)
File.write("parsed2.txt", arr2)
File.write("parsed3.txt", arr3)
