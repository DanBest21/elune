game = {}
game.map = {}
game.dataType = {NULL = 1, INT = 2, FLOAT = 3, BOOLEAN = 4, FUNCTION = 5, VAR = 6}
game.methodType = {GET = 1, SET = 2, CHECK = 3, UI = 4}

function game:getCategories()
	local categories = {}
	local i = 0
	for name, contents in pairs(game.map) do
		categories[i + 1] = name
		i = i + 1
	end

	return categories
end

function game:getRecordsOnType(methodType)
	local records = {}
	for _, category in pairs(game.map) do
		for name, record in pairs(category) do
			if record.methodType == methodType then
				records[name] = record
			end
		end
	end

	return records
end

function game:get(attribute)
	local methods = game:getRecordsOnType(game.methodType.GET)
	for methodName, methodContents in pairs(methods) do
		local i = 0
		for valueName, _ in pairs(methodContents.returnValues) do
			if valueName == attribute then
				return methodName
			end

			i = i + 1
		end

	end

end

function game:set(attribute, value)
	local methods = game:getRecordsOnType(game.methodType.SET)
	for methodName, methodContents in pairs(methods) do
		for valueName, _ in pairs(methodContents.returnValues) do
			if valueName == attribute then
				return methodName
			end

		end

	end

end

function game:check(attribute)
	local methods = game:getRecordsOnType(game.methodType.CHECK)
	for methodName, methodContents in pairs(methods) do
		for valueName, _ in pairs(methodContents.returnValues) do
			if valueName == attribute then
				return methodName
			end

		end

	end

end

function game:addCategory(name, contents)
	game.map[name] = contents
end

function game:getCategory(name)
	return game.map[name]
end

function game:call(category, name, ...)
	local expectedReturnValues = size(game.map[category][name].returnValues)
	local values = {game.map[category][name].method(...)}
	local status, err = pcall(function(name, category, ...)  if (#values ~= expectedReturnValues) then error({code = "DispatcherException"}); end; end)
	if not status then
		if err.code == "DispatcherException" then
		     print("DispatcherException: Function '" .. name .. "' returned " .. #values .. " values, but expected " .. expectedReturnValues .. ".");
		end
 end

	return values
end

function game:getDescription(category, name)
	return game.map[category][name].description
end

function game.new(f, t, params, ret, desc, add)
	local record = {method = f, methodType = t, parameters = params, returnValues = ret, description = desc, additionalInformation = add}
	return record
end
