file = File.open("minofthree.txt")

lines = file.readlines 

parse = lines.map{ |x| x.split(" ") } 

arr1 = []
arr2 = []
arr3 = []

parse.each do |i|
  count = 1
  i.each do |x|
    if count == 1
      arr1 << x 
    elsif count == 2
      arr2 << x 
    else 
      arr3 << x 
    end 
  count += 1 
  end
end 

arr1 = arr1.map{ |x| x.to_i } 
arr2 = arr2.map{ |x| x.to_i }
arr3 = arr3.map{ |x| x.to_i }


File.write("parsed1.txt", arr1)
File.write("parsed2.txt", arr2)
File.write("parsed3.txt", arr3)
