file = File.open(ARGV[0])

lines = file.readlines 


parse = lines.map{ |x| x.split(" ") } 

arr1 = []
arr2 = [] 

parse.each do |i|
  count = 1
  i.each do |x|
    if count == 1
      arr1 << x.to_i
    else count == 2
      arr2 << x.to_i 
    end 
  count += 1 
  end
end 


File.write("parsed.txt", arr1)
File.write("parsed2.txt", arr2)

