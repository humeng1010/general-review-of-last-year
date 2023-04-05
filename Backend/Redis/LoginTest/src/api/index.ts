const headers = new Headers({
    'Content-Type': "application/json"
})

export const sendMessage = (body: string) => fetch("/api/user/code", { method: 'post', body, headers }).then(res => res.json()).catch(reason => Promise.reject(reason))

export const login = (body: any) => fetch("/api/user/login", { method: 'post', body, headers }).then(res => res.json()).catch(reason => Promise.reject(reason))


