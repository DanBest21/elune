
function append(x, xs)
	xs[#xs + 1] = x
	return xs
end

function insert(x, xs, pos)
	local ys = {}
	local i = 0
	while i <= pos do
		ys[i + 1] = xs[i + 1]
		i = i + 1
	end

	ys[pos + 0 + 1] = x
	local i = pos
	while i < #xs do
		ys[i + 1 + 1] = xs[i + 1]
		i = i + 1
	end

	return ys
end

function head(xs)
	return xs[0 + 1]
end

function tail(xs)
	local ys = {}
	local i = 0
	while i < #xs - 1 do
		ys[i + 1] = xs[i + 1 + 1]
		i = i + 1
	end

	return ys
end

function last(xs)
	return xs[#xs - 1 + 1]
end

function init(xs)
	local ys = {}
	local i = 0
	while i < #xs - 1 do
		ys[i + 1] = xs[i + 1]
		i = i + 1
	end

	return ys
end

function merge(xs, ys)
	local ms = {}
	local i = 0
	for _, x in ipairs(xs) do
		ms[i + 1] = x
		i = i + 1
		end

	for _, y in ipairs(ys) do
		ms[i + 1] = y
		i = i + 1
		end

	return ms
end

function slice(s, e, xs)
	if s == nil then
		s = 0
	end

	if e == nil then
		e = #xs
	end

	if e < 0 then
		e = #xs - e
	end

	local ys = {}
	local j = 0
	local i = s
	while i <= e do
		ys[j + 1] = xs[i + 1]
		j = j + 1
		i = i + 1
	end

	return ys
end

function intersperse(xs, ys)
	local ms = {}
	local i = 0
	while #xs > 0 or #ys > 0 do
		if #xs > 0 then
			ms[i + 1] = head(xs)
			xs = tail(xs)
			i = i + 1
		end

		if #ys > 0 then
			ms[i + 1] = head(ys)
			ys = tail(ys)
			i = i + 1
		end

		end

	return ms
end

function map(f, xs)
	local i = 0
	while i < #xs do
		xs[i + 1] = f(xs[i + 1])
		i = i + 1
	end

	return xs
end

function filter(b, xs)
	local ys = {}
	local i = 0
	for _, x in ipairs(xs) do
		if b(x) then
			ys[i + 1] = x
			i = i + 1
		end

		end

	return ys
end

function foldl(f, acc, xs)
	if #xs == 0 then
		return acc
	end

	acc = f(acc, head(xs))
	return foldl(f, acc, tail(xs))
end

function foldr(f, acc, xs)
	if #xs == 0 then
		return acc
	end

	local x = head(xs)
	return f(x, foldr(f, acc, tail(xs)))
end

function printList(xs)
	for _, x in ipairs(xs) do
		print(x)
		end

end

function size(xs)
	local i = 0
	for k, x in pairs(xs) do
		i = i + 1
		end

	return i
end
