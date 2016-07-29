song = 'WUBWEWUBAREWUBWUBTHEWUBCHAMPIONSWUBMYWUBFRIENDWUB'

song_decoded = song.split('WUB').delete_if { |a| a == 'WUB' || a == '' }
solution = song_decoded.join(' ').strip
puts solution
